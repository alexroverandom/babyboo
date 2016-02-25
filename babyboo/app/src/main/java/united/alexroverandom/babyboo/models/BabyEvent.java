package united.alexroverandom.babyboo.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import united.alexroverandom.babyboo.models.interfaces.IBabyEvent;

/**
 * Created by alexroverandom on 20-Feb-16.
 */
public abstract class BabyEvent implements IBabyEvent {
    public Date Time;

    public BabyEvent() {
        Calendar c = Calendar.getInstance();
        Time = c.getTime();
    }

    public BabyEvent(Date date) {
        Time = date;
    }
}
