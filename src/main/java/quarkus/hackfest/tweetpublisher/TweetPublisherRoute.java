package quarkus.hackfest.tweetpublisher;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.twitter.data.TimelineType;

import javax.enterprise.context.Dependent;

@Dependent
public class TweetPublisherRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

      //from("timer:twitter-timer?repeatCount=1")
      from("{{kafka.consumer.url}}")
         .routeId("tweet-publisher")
         .log("sending tweet")
         .to("bean:tweetTextBean")
         .to("twitter-timeline:"+ TimelineType.USER+"?{{twitter.parameters}}")
         .log("Tweet Sent, Response : ${body}");

    }
}
