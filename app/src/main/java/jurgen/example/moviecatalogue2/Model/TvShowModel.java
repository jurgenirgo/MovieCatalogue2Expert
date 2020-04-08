package jurgen.example.moviecatalogue2.Model;

import android.content.res.TypedArray;
import java.util.ArrayList;

import jurgen.example.moviecatalogue2.R;

public class TvShowModel {


    public ArrayList<ItemModel> getMovieData() {
        ArrayList<ItemModel> item = new ArrayList<>();

        item.add(new ItemModel(
                R.drawable.poster_arrow,
                "Arrow",
                "October 10, 2012",
                "Greg Berlanti",
                "42m",
                "English",
                "58",
                "Crime, Drama",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow."
        ));

        item.add(new ItemModel(
                R.drawable.poster_doom_patrol,
                "Doom Patrol",
                "February 15, 2019",
                "Jeremy Carver",
                "60m",
                "English",
                "61",
                "SCI-FI and Fantasy",
                "The Doom Patrols members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."
        ));

        item.add(new ItemModel(
                R.drawable.poster_dragon_ball,
                "Dragon Ball",
                "February 26, 1986",
                "Akira Toriyama",
                "25m",
                "Japanese",
                "71",
                "Comedy, Adventure",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Gokus home. Together, they set off to find all seven dragon balls in an adventure that would change Gokus life forever. See how Goku met his life long friends Bulma, Yamcha, Krillin, Master Roshi and more."
        ));

        item.add(new ItemModel(
                R.drawable.poster_fairytail,
                "Fairy Tail",
                "October 12, 2009",
                "Unknown",
                "25m",
                "Japanese",
                "64",
                "Animation, Comedy",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isnt just any ordinary kid, hes a member of one of the worlds most infamous mage guilds: Fairy Tail."
        ));

        item.add(new ItemModel(
                R.drawable.poster_family_guy,
                "Family Guy",
                "January 31, 1999",
                "Seth MacFarlane",
                "22m",
                "English",
                "65",
                "Animation, Comedy",
                "Sick, twisted, politically incorrect and Freakin Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he is not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues."
        ));

        item.add(new ItemModel(
                R.drawable.poster_flash,
                "The Flash",
                "October 7, 2014",
                "Geoff Johns",
                "44m",
                "English",
                "67",
                "Drama, SCI-FI",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it wont be long before the world learns what Barry Allen has become…The Flash."
        ));

        item.add(new ItemModel(
                R.drawable.poster_god,
                "Game of Thrones",
                "April 17, 2011",
                "David Benioff",
                "60m",
                "English",
                "81",
                "Drama, SCI-FI",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Nights Watch, is all that stands between the realms of men and icy horrors beyond."
        ));

        item.add(new ItemModel(
                R.drawable.poster_gotham,
                "Gotham",
                "September 22, 2014",
                "Bruno Heller",
                "60m",
                "Cantonese",
                "69",
                "Drama, Crime",
                "Everyone knows the name Commissioner Gordon. He is one of the crime worlds greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordons story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the worlds most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?"
        ));

        item.add(new ItemModel(
                R.drawable.poster_grey_anatomy,
                "Greys Anatomy",
                "March 27, 2005",
                "Shonda Rhimes",
                "43m",
                "English",
                "62",
                "Drama",
                "Follows the personal and professional lives of a group of doctors at Seattles Grey Sloan Memorial Hospital."
        ));

        item.add(new ItemModel(
                R.drawable.poster_hanna,
                "Hanna",
                "March 28, 2019",
                "David Farr",
                "50",
                "English",
                "64",
                "Action, Adventure",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film."
        ));
        return item;
    }
}
