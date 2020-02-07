package adupto.bean;

import org.springframework.stereotype.Component;

@Component
public class PostData {
    private  Integer dv_num;
    private  String pic_url;
    private  String vid_url;

    public Integer getDv_num() {
        return dv_num;
    }

    public void setDv_num(Integer dv_num) {
        this.dv_num = dv_num;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getVid_url() {
        return vid_url;
    }

    public void setVid_url(String vid_url) {
        this.vid_url = vid_url;
    }
}
