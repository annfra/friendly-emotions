package pg.autyzm.przyjazneemocje.chooseImages;

import android.content.ContentResolver;

/**
 * Created by Joanna on 2016-10-11.
 */

public class RowBean {


    String photoName;
    boolean selected;
    ContentResolver cr;
    int id;


    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getId() {
        return id;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }


    public RowBean() {

    }

    public RowBean(String photoName, int icon, boolean selected, ContentResolver cr, int id) {
        this.photoName = photoName;
        this.selected = selected;
        this.cr = cr;
        this.id = id;
    }
}