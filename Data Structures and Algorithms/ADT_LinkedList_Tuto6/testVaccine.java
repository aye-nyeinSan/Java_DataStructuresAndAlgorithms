import java.util.ArrayList;
import java.util.List;

public class testVaccine {
    public static void main(String[] args) {
       
       
        ArrayLinkedList<VaccinePerson> list=new ArrayLinkedList<VaccinePerson>();
       

        VaccinePerson v1=new VaccinePerson(1, "aye", "san",new String[]{"India Vaccine"} );
        VaccinePerson v2=new VaccinePerson(2, "Naw", "gloria", new String[]{"Chinese vaccine","Johnson N Johnson"});
       // VaccinePerson v3=new VaccinePerson(3, "aye", "san",new String[]{"Johnson N Johnson"} );
        VaccinePerson v4=new VaccinePerson(4, "aye", "san",new String[]{"Johnson N Johnson"} );
        VaccinePerson v5=new VaccinePerson(5, "aye", "san",new String[]{"India","Johnson N Johnson"} );
        VaccinePerson v6=new VaccinePerson(6, "aye", "san",new String[]{"India","Johnson N Johnson"} );
        VaccinePerson v7=new VaccinePerson(7, "aye", "san",new String[]{"India","Johnson N Johnson"} );
        VaccinePerson v8=new VaccinePerson(8, "aye", "san",new String[]{"India","Johnson N Johnson"} );
        VaccinePerson v9=new VaccinePerson(9, "aye", "san",new String[]{"India","Johnson N Johnson"} );
        VaccinePerson v10=new VaccinePerson(10, "aye", "san",new String[]{"India","Johnson N Johnson"});
        
        System.out.println(list.isEmpty());
         list.insert(new VaccinePerson(3, "aye", "san",new String[]{"Johnson N Johnson"} ));
         list.insert(v4);
         list.insert(v10); 
         list.insert(v6);
         System.out.println(list.getSize());
        // list.delete(5);
         //System.out.println(list.getSize());
        // list.traversal();
        // list.find(v10);
         System.out.println( list.find(v10));
         list.deleteAll();
         System.out.println(list.isEmpty());


        
       

    }
}
