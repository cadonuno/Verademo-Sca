package com.veracode.verademo;

import org.codehaus.plexus.util.cli.shell.Shell;

public class VulnerableMethodCaller {
    public static void aCallerToAVulnerableMethod(String someExecutable, String[] someArguments) {
        Shell shell = new Shell();
        shell.getCommandLine(someExecutable, someArguments);
    }
}
