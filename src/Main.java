

class Main {
    public static void main(String[] args)  {
        String str = "百二十三";
        
        try {
            int value = Integer.parseInt(str);
            
            
        } catch (NumberFormatException e) { 
            System.out.println("NumberFormatExceptionが発生しました。"); 
            
        }
        
    }
}
