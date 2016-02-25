package united.alexroverandom.babyboo.models;

import java.util.Date;

import united.alexroverandom.babyboo.models.enums.PampersEventType;
import united.alexroverandom.babyboo.models.enums.PampersType;

/**
 * Created by alexroverandom on 20-Feb-16.
 */
public class PampersEvent extends BabyEvent {

    public PampersEventType Type;
    public PampersType PampersType;

    public void changeTime(Date newTime) {
        Time = newTime;
    }

    public PampersEvent(PampersEventType type, PampersType pampersType) {
        Type = type;
        PampersType = pampersType;
    }

    public PampersEvent(Date time, PampersEventType type, PampersType pampersType) {
        Type = type;
        PampersType = pampersType;
        Time = time;
    }

    public PampersEvent() { }
}
