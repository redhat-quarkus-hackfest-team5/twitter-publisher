package quarkus.hackfest.tweetpublisher.bean;

import org.apache.camel.Exchange;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("tweetTextBean")
public class TweetTextBean {

    public void generateTweet(Exchange exchange){

        String gpName = exchange.getIn().getBody(String.class);

        exchange.getIn().setBody("Who do you think is gonna win #GP"+ gpName + "  ?  #WhoWins");

    }

}
