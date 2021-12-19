class Msg {
	
	void Msg(int arg)  {
		System.out.println(arg);
	}
}

class getMessage{
    void getMessage(int aaa){
        System.out.println(aaa);

    }

}

class Main {
    public static void main(String[] args)  {
        String str = null;
        Msg obj = new Msg();
        getMessage gM = new getMessage();

        try {
            obj.Msg(str.length());
            
        } catch (NullPointerException e) { 
            System.out.println("NullPointerExceptionが発生しました。"); 
            gM.getMessage(345);
        }
        
    }
}
