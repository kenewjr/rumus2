import java.util.*;

class hasil{
private Integer balok = 0;
private float tabung = 0;
private float limas = 0;

public Integer getmyBalok(){
return balok;
}
public float getmyTabung(){
return tabung;
}
public float getmyLimas(){
return limas;
}

public void setmyBalok(Integer newgetmyBalok){
this.balok = newgetmyBalok;
}
public void setmyTabung(float newmyTabung){
this.tabung = newmyTabung;
}
public void setmyLimas(float newmyLimas){
this.limas = newmyLimas;
}
}

public class rumus2 {
Scanner input = new Scanner(System.in);
hasil hs = new hasil();
float rr,p,k,v,u,h,al,aa,ab,ac,fz,fq;
int az,as,ad,fb;
String pimpong;

void rumusBalok(){
    do{
System.out.println("rumus : p × l × t");
System.out.println("masukan bilangan panjang : ");
az=input.nextInt();
System.out.println("masukan bilangan lebar");
as=input.nextInt();
System.out.println("masukan bilangan tinggi");
ad=input.nextInt();
fb=az*as*ad;
hs.setmyBalok(fb);
System.out.println("hasil = "+hs.getmyBalok());
System.out.print("coba rumus balok lagi? ");
pimpong = input.next();	
 }
 while(pimpong.equals("yes") || pimpong.equals("y") || pimpong.equals("YES") || pimpong.equals("y"));        
}

void rumusTabung(){
    do{
System.out.println("rumus : phi x r2 x t");
System.out.println("masukan bilangan jari jari");
rr=input.nextFloat();
p=rr*rr;
System.out.println("masukan bilangan tinggi");
k=input.nextFloat();
v=3.14f;
u=p*k;
h=v*u;
hs.setmyTabung(h);
System.out.println("hasil : "+hs.getmyTabung());
System.out.print("coba rumus tabung lagi? ");
pimpong = input.next();	
 }
 while(pimpong.equals("yes") || pimpong.equals("y") || pimpong.equals("YES") || pimpong.equals("y"));
}

void rumusLimas(){
    do{
System.out.println("rumus : 1/3 × s2 × t");
System.out.println("masukan bilangan panjang sisi alas : ");
aa=input.nextFloat();
ab=aa*aa;
System.out.println("masukan bilangan tinggi limas : ");
ac=input.nextFloat();
fz=ab*ac;
fq=1/3f*fz;
hs.setmyLimas(fq);
System.out.println("hasil : " +hs.getmyLimas());
System.out.print("coba rumus limas segi empat lagi? ");
pimpong = input.next();	
 }
 while(pimpong.equals("yes") || pimpong.equals("y") || pimpong.equals("YES") || pimpong.equals("y"));     
}
static void Rumus(){
System.out.println("1.Balok");
System.out.println("2.Tabung");
System.out.println("3.Limas Segi Empat");
}

public static void main (String[] args){
rumus2 result = new rumus2();
String answer;
do {
Rumus();
System.out.print("pilih rumus : ");
int a;
 do{
a=result.input.nextInt();
if(a>3 || a<1){
System.out.println("mohon masukan nomor 1,2,3");
}
}
   while(a>3 || a<1);

switch(a){
case 1:
    result.rumusBalok();     
break;

case 2:
    result.rumusTabung();
break;

case 3:
    result.rumusLimas();
break;
}
System.out.print("coba rumus yang lain? ");
        answer = result.input.next();			 
}
while (answer.equals("yes") || answer.equals("y") || answer.equals("YES") || answer.equals("y"));
}
}