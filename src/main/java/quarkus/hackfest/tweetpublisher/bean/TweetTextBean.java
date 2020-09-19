package quarkus.hackfest.tweetpublisher.bean;

import org.apache.camel.Exchange;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.logging.Logger;

@Singleton
@Named("tweetTextBean")
public class TweetTextBean {

    static Logger logger = Logger.getLogger(TweetTextBean.class.getName());

    public void generateTweet(Exchange exchange){

        String gpName = exchange.getIn().getBody(String.class);

        exchange.getIn().setBody("Who do you think is gonna win "+ prepareHashtag(gpName) + " ?  #WhoWins");

    }

    public static String prepareHashtag(String word){
        StringBuilder hashtag =  new StringBuilder();
        hashtag.append("#");
        hashtag.append(word.replaceAll(" ", "").replaceAll("\"", ""));

        logger.info(" Hashtag generated: " + hashtag.toString());

        return  hashtag.toString();
    }

}
