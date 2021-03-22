package tech.allegro.hexagon.articles.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelperClass {

    ObjectMapper objectMapper;

    public HelperClass(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String updateSectionVisibility(String jsonPayLoad, String indexToMatch, String sectionVisibilityToUpdate) throws JsonProcessingException {
        SectionList sectionList = objectMapper.readValue(jsonPayLoad, SectionList.class);
        List<Section> sections = sectionList.getSections();

        for(Section section: sections){
            if(section.getSectionIndex().equalsIgnoreCase(indexToMatch)){
                section.setSectionVisibility(sectionVisibilityToUpdate);
            }
        }

        return objectMapper.writeValueAsString(new SectionList(sections));
    }

}

class SectionList{
    List<Section> sections;

    public SectionList() {
    }

    public SectionList(List<Section> sections) {
        this.sections = sections;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}

class Section{
    private String sectionIndex;
    private String sectionId;
    private String sectionName;
    private String sectionName_ar;
    private String sectionVisibility;

    public String getSectionIndex() {
        return sectionIndex;
    }

    public void setSectionIndex(String sectionIndex) {
        this.sectionIndex = sectionIndex;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionName_ar() {
        return sectionName_ar;
    }

    public void setSectionName_ar(String sectionName_ar) {
        this.sectionName_ar = sectionName_ar;
    }

    public String getSectionVisibility() {
        return sectionVisibility;
    }

    public void setSectionVisibility(String sectionVisibility) {
        this.sectionVisibility = sectionVisibility;
    }
}
