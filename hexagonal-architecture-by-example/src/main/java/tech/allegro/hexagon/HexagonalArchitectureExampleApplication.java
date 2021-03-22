package tech.allegro.hexagon;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.allegro.hexagon.articles.config.HelperClass;

@SpringBootApplication
public class HexagonalArchitectureExampleApplication {

    static HelperClass helperClass;

    public HexagonalArchitectureExampleApplication(HelperClass helperClass) {
        this.helperClass = helperClass;
    }

    public static void main(String[] args) {
        SpringApplication.run(HexagonalArchitectureExampleApplication.class, args);
        String json = "{\"sections\":[{\"sectionIndex\":\"0\",\"sectionId\":\"SEC_RECHARGE\",\"sectionName\":\"\",\"sectionName_ar\":\"\",\"sectionVisibility\":\"true\"},{\"sectionIndex\":\"1\",\"sectionId\":\"SEC_USAGE\",\"sectionName\":\"My Usage\",\"sectionName_ar\":\"استخدامي\",\"sectionVisibility\":\"true\"},{\"sectionIndex\":\"2\",\"sectionId\":\"SEC_SWYP_BUDDY\",\"sectionName\":\"\",\"sectionName_ar\":\"\",\"sectionVisibility\":\"true\"},{\"sectionIndex\":\"3\",\"sectionId\":\"SEC_EVENTS_PROMO\",\"sectionName\":\"\",\"sectionName_ar\":\"\",\"sectionVisibility\":\"false\"},{\"sectionIndex\":\"4\",\"sectionId\":\"SEC_WHATS_HAPPENING\",\"sectionName\":\"Whats's Happening?\",\"sectionName_ar\":\"كل ما هو جديد\",\"sectionVisibility\":\"true\"},{\"sectionIndex\":\"5\",\"sectionId\":\"SEC_PACKS\",\"sectionName\":\"Packs For You\",\"sectionName_ar\":\"عروض تناسبك\",\"sectionVisibility\":\"true\"},{\"sectionIndex\":\"6\",\"sectionId\":\"SEC_INVITE_FREIND\",\"sectionName\":\"\",\"sectionName_ar\":\"\",\"sectionVisibility\":\"true\"}]}";
        try {
            helperClass.updateSectionVisibility(json,"1","false");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

}
