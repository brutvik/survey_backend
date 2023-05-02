package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;



@RestController
//@RequestMapping("/response")
public class Controller {
    @Autowired
    private SurveyRepository surveyRepository;
    
    // @PostMapping("/response")
    // public Survey createSurvey(@RequestBody Survey survey) {
    //     return demoApplicationRepository.save(survey);
    // }

      @PostMapping(path="/add") // Map ONLY POST Requests
  public ResponseEntity<String> createSurvey(@RequestBody Survey survey) {
        // Your code here
        //return ResponseEntity.ok("User created successfully");
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Survey n = new Survey();
    n.setEmail(survey.email);
    n.setFirstName(survey.firstname);
    n.setLastName(survey.lastname);
    n.setAddress(survey.address);
    n.setCity(survey.city);
    n.setState(survey.state);
    n.setZip(survey.zip);
    n.setNumber(survey.number);
    n.setLikes(survey.likes);
    n.setInterest(survey.interest);
    n.setRecommendation(survey.recommendation);
    n.setDate(survey.date);
    surveyRepository.save(n);
    
    return ResponseEntity.ok("survey recorded successfully");
  }

  @GetMapping(path="/all")
   public @ResponseBody Iterable<Survey> getAllSurveys() {
    // This returns a JSON or XML with the users
    return surveyRepository.findAll();
  }


}