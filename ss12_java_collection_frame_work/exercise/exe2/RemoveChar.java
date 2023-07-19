package ss12_java_collection_frame_work.exercise.exe2;

public class RemoveChar {
    public static String removeChar (int index,String string){
        return string.substring(0,index) + string.substring(index + 1);
    }
}
