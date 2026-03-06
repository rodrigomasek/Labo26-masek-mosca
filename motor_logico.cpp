#include <iostream>
#include <string>
#include <vector>


using namespace std;

struct zombie_t
{
  string tipo;
  int danio;
  int velocidad;  
};

int main ()
{
    zombie_t zombie;

    vector <string> mochila = {"medkit", "Ammobox", "llave"};
    int salud = 100;
    string nombre = "jugador";
    bool infectado = false;
    int municion = 30;
    int danio = 25;
    int saludZ = 100;
    int i;

    
    cout<<"Estado inicial: Salud: "<<salud<<" ,Nombre: "<<nombre<<"."<<endl;
    cout<<"Enemigo Zombi avistado!!! Disparando..."<<endl;
    cout<<"Acierto!!! " << danio << ". Salud del zombie: "<<saludZ-danio<<"Nombre: "<<nombre<<"."<<endl;
    cout<<"revidando caja... !item encontrado: medkit inventario: "<< mochila[0] << endl;
    cout<<"revidando caja... !item encontrado: medkit inventario: "<< mochila[0] << endl;
    cout << "cliclo de activo." << "salud: " << salud - 5 << ", Nombre: " << nombre << ". Inventario actual: " << mochila[0] << "," << mochila[1]<< endl;
    cout << "fin de simulacion" << endl;
    cout << "fin de simulacion" << endl;
    cout << "estado final: " << salud - 10 << ", nombre: " << nombre << ", inventario: " << mochila[0] << " " << mochila[1] << " " << mochila[2] << " " << endl; 
}