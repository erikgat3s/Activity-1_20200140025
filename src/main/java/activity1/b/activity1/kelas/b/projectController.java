/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1.b.activity1.kelas.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ERIK
 */
@Controller
public class projectController {
    
    @RequestMapping("/mytable")
    public String getTable(Model Data){
        
    ArrayList<List<String>> data = new ArrayList <>();
        
        data.add(Arrays.asList("ID", "Nomor KTP", "Nama", "Alamat"));
        data.add(Arrays.asList("021", "2000011312", "Erik", "Batam"));
        data.add(Arrays.asList("022", "2000011313", "Andre", "Papua"));
        data.add(Arrays.asList("023", "2000011314", "Kenan", "Yogyakarta"));
        data.add(Arrays.asList("024", "2000011315", "Fajar", "Yogyakarta"));
        data.add(Arrays.asList("025", "2000011316", "Wahyu", "Yogyakarta"));
        data.add(Arrays.asList("026", "2000011317", "Galih", "Yogyakarta"));
        data.add(Arrays.asList("027", "2000011318", "Yudis", "Yogyakarta"));
        data.add(Arrays.asList("028", "2000011319", "Raihan", "Yogyakarta"));
        data.add(Arrays.asList("029", "2000011320", "Amir", "Yogyakarta"));
        data.add(Arrays.asList("030", "2000011321", "Asra", "Jambi"));
        data.add(Arrays.asList("031", "2000011322", "Ipin", "Batam"));
        data.add(Arrays.asList("032", "2000011323", "Indra", "Kalimantan"));
        data.add(Arrays.asList("033", "2000011324", "Naufal", "Aceh"));
        data.add(Arrays.asList("034", "2000011325", "Agung", "Wonosobo"));
        data.add(Arrays.asList("035", "2000011326", "Putri", "Padang"));
        data.add(Arrays.asList("036", "2000011327", "Popo", "Padang"));
        data.add(Arrays.asList("037", "2000011328", "Oss", "Jakarta"));
        data.add(Arrays.asList("038", "2000011329", "Maracli", "Bekasi"));
        data.add(Arrays.asList("039", "2000011330", "Felisa", "Bandung"));
        data.add(Arrays.asList("040", "2000011331", "Annisa", "Bandung"));
        data.add(Arrays.asList("041", "2000011332", "Dwi", "Yogyakarta"));
        
        Data.addAttribute("table", data);
        
        
        return "tableViewer";
    }
    
}
