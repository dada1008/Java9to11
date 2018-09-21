package com.opensource.dada.java9;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.stream.Stream;

public class ProcessApiExample {
    public static void main(String[] args) {
        System.out.println("Hello " + ProcessApiExample.class.getSimpleName());

        ProcessHandle self = ProcessHandle.current();
        long pid = self.pid();
        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> procArgs = procInfo.arguments();
        Optional<String> cmd =  procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

        System.out.println("Process pid:" + pid);
        System.out.println("Process procArgs:");
        for (String procArg:procArgs.get()) {
            System.out.println("Process procArg:"+procArg);
        }
        System.out.println("Process cmd:" + cmd.get());
        System.out.println("Process startTime:" + startTime.get());
        System.out.println("Process cpuUsage in nano seconds:" + cpuUsage.get().getNano());

        Stream<ProcessHandle> childProc = ProcessHandle.current().children();
        childProc.forEach(procHandle -> {
            System.out.println("Child process pid:" + procHandle.pid());
        });

    }
}
