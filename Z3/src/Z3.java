import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Z3 {
    public static void main(String args[]){
        File f = new File("D:\\Anime\\BNHA\\hero-1");
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };
        FileFilter filter2 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        };
        File [] files = f.listFiles(filter);
        File [] files1 = f.listFiles(filter2);

        Arrays.sort(files, (o1, o2) -> o1.compareTo(o2));
        Arrays.sort(files1, (o1, o2) -> o1.compareTo(o2));


        for (int i = 0; i <files.length;i++){
            System.out.println(files[i].getName());
        }
        for (int i = 0; i < files1.length;i++){
            System.out.println(files1[i].getName());
        }
    }
}
