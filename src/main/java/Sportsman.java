import exception.SportsmenFailedWhiteRunningException;
import exception.StickTransferException;
import lombok.Data;

import javax.annotation.Nullable;
import java.util.Random;

@Data
public class Sportsman {
    Random RANDOM = new Random();
    int min = 1;
    int max = 10;

    private final String name;
    private final int level;
    @Nullable
    private Stick stick;
    private Object Sportsman;

    public void takeStick(Stick stick){
        System.out.println("Спортсмен " + this.name + " взял(а) палочку");
        this.stick = stick;
    }

    public void runStick(){
        System.out.println("Спортсмен " + this.name + " побежал(а)");
        if (level < 6){
            int fell = RANDOM.nextInt(max);
            if (fell < 5){
                throw new SportsmenFailedWhiteRunningException("Спортсмен упал");
            }
        }
        System.out.println("Успешно добегает " + this.name);
    }

    public void transference(Sportsman sportsman){
        transferStickRisky();
        System.out.println(this.name + " передает палочку " + sportsman.getName());
        sportsman.takeStick(stick);
        this.stick = null;
    }

    public void transferStickRisky(){
        if (level < 3){
            int fell = RANDOM.nextInt(max);
            if (fell < 8){
                throw new StickTransferException("Добегая, спортсмен кинул палочку - промахнулся");
            }
            System.out.println("Добегая, спортсмен кинул палочку - успешно");
        }
    }
}


