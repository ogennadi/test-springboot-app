package org.example.testspringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
public class EchoController {

    @GetMapping(value = "/sh")
    public String getSh() {
        String output = "";

        try {
            ProcessBuilder builder = new ProcessBuilder(
//            "cmd.exe", "/c", "echo %SECRET%"  // For Windows machines
                    "sh", "-c", "echo $SECRET"
            );
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;

            while (true) {
                line = r.readLine();
                if (line == null) {
                    break;
                }
                output += line;
            }
        } catch (Exception e){
            output = e.toString();
        }

        return output;
    }

    @GetMapping(value = "/env")
    public String getEnv() {
        String output = System.getenv("SECRET");

        return output;
    }

    @PostMapping(value = "/")
    public String echoPost(@RequestBody String body){
        String output = System.getenv("SECRET");

        return output;
    }


}
