package testGitHub.service.service1;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class testService {
    @PostConstruct
    public void test(){
        System.out.println("ssss");
    }
}
