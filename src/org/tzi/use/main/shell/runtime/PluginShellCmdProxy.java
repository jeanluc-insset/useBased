/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tzi.use.main.shell.runtime;

import org.tzi.use.main.Session;
import org.tzi.use.main.shell.Shell;

/**
 *
 * @author jldeleage
 */
public class PluginShellCmdProxy implements IPluginShellCmd {

    @Override
    public void executeCmd(String cmd, String cmdArguments) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getCmd() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Session getSession() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Shell getShell() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getCmdArguments() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
