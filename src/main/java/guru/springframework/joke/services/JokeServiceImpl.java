package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    // Final variable so it can not be changed ,
    // so class will be created once and reused. So it's more efficient
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // commented to be refactored
/*    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }*/

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) { // needs configuration
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
