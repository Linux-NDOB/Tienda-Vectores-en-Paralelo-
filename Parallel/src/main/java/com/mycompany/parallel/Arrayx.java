
package com.mycompany.parallel;

import javax.swing.JOptionPane;


public class Arrayx {
    
    
    
    public POJO Code[];
    public POJO Name[];
    public POJO Price[];
    public POJO Amount[];
    public POJO Mult[];
    
    
    public int getNORepeat(int codigo){
        int i;
        for(i=0; i<Code.length; i++){
            if(Code[i].getCodigo() == codigo)
                return i;
        }
        return -1;
        }
    
    Arrayx(){
            
        try{
     
       
      
       
        
       int x = Integer.parseInt(JOptionPane.showInputDialog(null,"please give me the size of the array"));
        
        Code = new POJO[x];
        Name = new POJO[x];
        Price = new POJO[x];
        Amount = new POJO[x];
        Mult = new POJO[x];
        }catch(IndexOutOfBoundsException a){
        JOptionPane.showInputDialog(null, a);
        }
        int i;
        for(i=0; i<Code.length; i++){
            Code[i] = new POJO( -1, " ", -1, -1);
        }
        
        for(i=0; i<Name.length; i++){
            Name[i] = new POJO( -1, " ", -1, -1);
        }
        
        for(i=0; i<Price.length; i++){
            Price[i] = new POJO( -1, " ", -1, -1);
        }
        
        for(i=0; i<Amount.length; i++){
            Amount[i] = new POJO( -1, " ", -1, -1);
        }
        
         for(i=0; i<Mult.length; i++){
            Mult[i] = new POJO( -1, " ", -1, -1);
        }
        
        
        Object TypeProducts[] = {"Rice","Meat","Fish","Apple",
                            "Cake","Candy","Hot Dogs"};
        
       
        int code , amount,pos;
        float price;
        String name;
        
        for(i=0; i<Name.length; i++){
        do{ 
            
        code=Integer.parseInt(JOptionPane.showInputDialog(
        "Enter the product code please  \n"
        +"this in the  position of the Array"+i+": "));
        pos=getNORepeat(code);
               
        if(pos>=0){
        JOptionPane.showMessageDialog(null, 
        "Sorry we can't add this code cause\n"
        + " is in use in use,please try again!");      
        }
        else{
        Code[i].setCodigo(code);
        }
        }
        while(pos>=0);
            
        Object createPorduct = JOptionPane.showInputDialog(null,"Please choose a Product \n"
        +"there are 7 products for sale ","List of Products ",
        JOptionPane.QUESTION_MESSAGE,null,TypeProducts, TypeProducts[0]);
        name = createPorduct.toString();
        Name[i].setNombre(name);   
        
        price = Float.parseFloat(JOptionPane.showInputDialog(
                    "Enter the Product\n"
                    +" Price please: "));
         Price[i].setPrecio(price);
         
         
        amount = Integer.parseInt(JOptionPane.showInputDialog(
                    "Enter the Product\n"
                   +"Amount in store please"));
        
       Amount[i].setCantidad(amount);
        }    
        
        
           }    
    
     public void setSortBubble(){
        int i, j;
        POJO Tem=null;
        
        for(i=0; i<Code.length && i<Name.length && i<Price.length && i<Amount.length; i++){ 
            
        for(j=0; j<(Code.length - 1) && j<(Name.length - 1) && j<(Price.length - 1) && j<(Amount.length - 1); j++){
            
            
        if( Code[j].getCodigo()> Code[j+1].getCodigo() ){
                    
        Tem = new POJO( Code[j].getCodigo(), 
        Name[j].getNombre(), Price[j].getPrecio(),
        Amount[j].getCantidad());
                  
        Code[j].setCodigo(Code[j+1].getCodigo());
        Name[j].setNombre(Name[j+1].getNombre());
        Price[j].setPrecio(Price[j+1].getPrecio());
        Amount[j].setCantidad(Amount[j+1].getCantidad());
                   
        Code[j+1].setCodigo(Tem.getCodigo());
        Name[j+1].setNombre(Tem.getNombre());
        Price[j+1].setPrecio(Tem.getPrecio());
        Amount[j+1].setCantidad(Tem.getCantidad());
       
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Vector sorted in Asc order!");
        }
    
     public void getShowInformation(){
       
        for (int i = 0; i < Code.length; i++) {
        JOptionPane.showMessageDialog(null, (i) + " Information of all products"
                                               + "\nProduct Code: " + Code[i].getCodigo()
                                               + "\nProduct Name: " + Name[i].getNombre()
                                               + "\nProduct Price: " + Price[i].getPrecio()
                                               + "\nProduct Amount: " + Amount[i].getCantidad());
        }}
        
        
    
        public void perCode(){
            
        int per= Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the code to search"));
        for (int i = 0; i < Code.length; i++) {
        if(Code[i].getCodigo() == per){
                                              
                                               JOptionPane.showMessageDialog(null, "in the vector positin"+ (i) + " Code found "+ Code[i].getCodigo()
                                               + "\nProduct Code: " + Code[i].getCodigo()
                                               + "\nProduct Name: " + Name[i].getNombre()
                                               + "\nProduct Price: " + Price[i].getPrecio()
                                               + "\nProduct Amount: " + Amount[i].getCantidad()
                                               );
                                                                                        } 
        
         
               
                
        }
        JOptionPane.showMessageDialog(null, "Sorry any product has this code registered");
                
}
        
        public void Conditionals(){
            
            
            
        for(int i =0; i<Price.length && i<Amount.length; i++){
            
        if (Price[i].getPrecio() > 2500
            && Amount[i].getCantidad() <5 ){
        
          JOptionPane.showMessageDialog(null, "Located in the position"+(i) + " Product information"
                                               + "\nCode: " + Code[i].getCodigo()
                                               + "\nName: " + Name[i].getNombre()
                                               + "\nPrice: " + Price[i].getPrecio()
                                               + "\nAmount: " + Amount[i].getCantidad()
                                               );
        
        }else{
        
        JOptionPane.showMessageDialog(null,"Sorry any product has the requeriments");
        
        }
        
       
        
        }  
}

public void Mult(){
    
for(int i =0; i<Price.length; i++){
     float mul = (float)Amount[i].getCantidad() * Price[i].getPrecio();
     Mult[i].setMultiplicacion(mul);
     JOptionPane.showMessageDialog(null, "Total value of each product  "+(i) + " Results "+ Name[i].getNombre()
                                               + "\nPrduct code: " + Code[i].getCodigo()
                                               + "\nProduct name: " + Name[i].getNombre()
                                               + "\nProduct price: " + Price[i].getPrecio()
                                               + "\nProduct amount: " + Amount[i].getCantidad()
                                               + "\nPrice x Amount : " + Mult[i].getMultiplicacion()
                                               );


}
}


}