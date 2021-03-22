package com.mkyong;

import java.util.*;

import com.mkyong.dto.HelperDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String welcome(Map<String, Object> model, HttpServletRequest request) {
		String baseURL = request.getRequestURI() + "images/";
		List<HelperDTO> list = Arrays.asList(
				new HelperDTO("Img1",baseURL + "image1.png"),
				new HelperDTO("Img2",baseURL + "image2.png"),
				new HelperDTO("Img3",baseURL + "image3.jpg")
				);
		model.put("imagesMap", list);

		return "cms_home_images_page";
	}

	@PostMapping(value = "uploadHomeImage", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String uploadHomeImage(String image){
		return "Selected image is: " + image;
	}

}