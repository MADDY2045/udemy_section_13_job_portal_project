package com.maddy.jobapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data /* defines all the getters , setters, to string and to hashcode method by default*/
@NoArgsConstructor/* creates a no argument constructor by default */
@AllArgsConstructor/* creates a argument constructor by default */
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
