package io.jenkins.plugins.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellOutService {

    public static void runCommand(String command) throws IOException, InterruptedException{
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("sh", "-c", command); //TODO set this as default, but give the option to change it

        Process process = processBuilder.start();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Process or store the output as needed
            }
        }

        int exitCode = process.waitFor();
        System.out.println("Process exited with code: " + exitCode); //TODO add logger instead of sout
    }
}
