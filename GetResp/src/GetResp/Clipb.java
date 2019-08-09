/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetResp;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alawicki
 */
public class Clipb {

    public String[] getClipboard() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        java.awt.datatransfer.Clipboard clipboard = toolkit.getSystemClipboard();
        String result = null;
        try {
            result = clipboard.getData(DataFlavor.stringFlavor).toString();
        } catch (UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(Clipb.class.getName()).log(Level.SEVERE, null, ex);
        }

        String str[] = result.split("\n");

        
        return str;
    }
}
