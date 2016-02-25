package united.alexroverandom.babyboo.models;

import java.util.Date;
import united.alexroverandom.babyboo.models.enums.MammaType;

/**
 * Created by alexroverandom on 20-Feb-16.
 */
public class EatEvent extends BabyEvent {

    public MammaType Mamma;


    public void changeTime(Date newTime) {
        Time = newTime;
    }
}
