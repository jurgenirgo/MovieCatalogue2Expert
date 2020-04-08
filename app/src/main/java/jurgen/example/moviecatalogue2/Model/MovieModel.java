package jurgen.example.moviecatalogue2.Model;

import java.util.ArrayList;

import jurgen.example.moviecatalogue2.R;

public class MovieModel {

    public ArrayList<ItemModel> getMovieData() {
        ArrayList<ItemModel> item = new ArrayList<>();

        item.add(new ItemModel(
                R.drawable.poster_spiderman,
                "Spider-Man: Into the Spider-Verse",
                "December 14, 2018",
                "Rodney Rothman",
                "1h 57m",
                "English",
                "84",
                "Action, Animation",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."
        ));

        item.add(new ItemModel(
                R.drawable.poster_bohemian,
                "Bohemian Rhapsody",
                "November 2, 2018",
                "Anthony McCarten",
                "2h 15m",
                "English",
                "81",
                "Drama, Music",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock n roll band Queen in 1970. Hit songs become instant classics. When Mercurys increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."
        ));

        item.add(new ItemModel(
                R.drawable.poster_aquaman,
                "Aquaman",
                "December 21, 2018",
                "James Wan",
                "2h 24m",
                "English",
                "68",
                "Action, Adventure",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orms half-human, half-Atlantean brother and true heir to the throne."
        ));

        item.add(new ItemModel(
                R.drawable.poster_alita,
                "Alita: Battle Angel",
                "January 31, 2019",
                "Robert Rodriguez",
                "2h 2m",
                "English",
                "67",
                "Action, Adventure",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."
        ));

        item.add(new ItemModel(
                R.drawable.poster_creed,
                "Creed II",
                "November 21, 2018",
                "Sylverster Stallone",
                "2h 10m",
                "English",
                "67",
                "Drama",
                "Between personal obligations and training for his next big fight against an opponent with ties to his familys past, Adonis Creed is up against the challenge of his life."
        ));

        item.add(new ItemModel(
                R.drawable.poster_how_to_train,
                "How to Train Your Dragon: The Hidden World",
                "January 3, 2019",
                "Dean DeBlois",
                "1h 44m",
                "English",
                "76",
                "Animation, Adventure",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccups reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."
        ));

        item.add(new ItemModel(
                R.drawable.poster_infinity_war,
                "Avengers: Infinity War",
                "April 27, 2018",
                "Anthony Russo",
                "2h 29m",
                "English",
                "83",
                "Adventure, Action",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."
        ));

        item.add(new ItemModel(
                R.drawable.poster_master_z,
                "Master Z: Ip Man Legacy",
                "April 12, 2019",
                "Yuen Woo-ping",
                "1h 47m",
                "Cantonese",
                "52",
                "Action, Drama",
                "After being defeated by Ip Man, Cheung Tin Chi is attempting to keep a low profile. While going about his business, he gets into a fight with a foreigner by the name of Davidson, who is a big boss behind the bar district. Tin Chi fights hard with Wing Chun and earns respect."
        ));

        item.add(new ItemModel(
                R.drawable.poster_ralph,
                "Ralph Breaks the Internet",
                "November 21, 2018",
                "Phil Johnston",
                "1h 52m",
                "English",
                "72",
                "Family, Comedy",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellopes video game, \"Sugar Rush.\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet the netizens to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube."
        ));

        item.add(new ItemModel(
                R.drawable.poster_robin_hood,
                "Robin Hood",
                "November 21, 2018",
                "Ben Chandler",
                "1h 56m",
                "English",
                "58",
                "Adventure, Action",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."
        ));

        return item;
    }


}
