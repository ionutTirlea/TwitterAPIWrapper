package security;

/**
 * Created by ionut.tirlea on 01/10/2017.
 */
public interface IAuthorizationConfiguration {

    String getUser();

    String getPassword();

    String getOAuthConsumerKey();

    String getOAuthConsumerSecret();

    String getOAuthAccessToken();

    String getOAuthAccessTokenSecret();

    String getOAuth2TokenType();

    String getOAuth2AccessToken();

}
