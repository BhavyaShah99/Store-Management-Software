/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author bhavyashah
 */

import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

public class ExcelExport {
    
    public ExcelExport()
    {
        
    }
    
    public void exportTable(JTable table, File file)throws IOException
    {
        TableModel model = table.getModel();
        FileWriter out = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(out);
            for(int i=0;i<model.getColumnCount();i++)
            {
                bw.write(model.getColumnName(i)+"\t");
            }
            bw.write("\n");
            
            for(int i=0;i<model.getColumnCount();i++)
            {
                for(int j=0;j<model.getColumnCount();j++)
                {
                    bw.write(model.getValueAt(i, j).toString()+"\t");
                }
            bw.write("\n");
            }
           bw.close();
           System.out.print("Write Out To"+file);
    }
}
