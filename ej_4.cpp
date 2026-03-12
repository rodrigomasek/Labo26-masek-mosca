/*
Un paseador de perros guarda en un sistema los datos de las mascotas 
que pasea. Los datos por guardar de cada perro son: nombre, edad, 
dirección, barrio y raza. 
Se tiene el siguiente menú con las siguientes funciones a desarrollar: 
1. Añadir mascota. 
2. Ver todas las mascotas de una determinada raza. 
3. Consultar dirección de una mascota determinada.
*/
#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct perros_t{
    string nombre;
    int edad;
    string direccion;
    string barrio;
    string raza;
};
void añadirMascota(vector <perros_t> &perros)
{
    perros_t perro;
    cout<<'\n'<<"Ingrese el nombre del perro: ";
    getline(cin, perro.nombre);
    cout<<"Ingrese la edad del perro: ";
    cin>>perro.edad;
    cin.ignore();
    cout<<"Ingrese la direccion del perro: ";
    getline(cin, perro.direccion);
    cout<<"Ingrese el barrio del perro: ";
    getline(cin, perro.barrio);
    cout<<"Ingrese la raza del perro: ";
    getline(cin, perro.raza);
    perros.push_back(perro);
}
int mostrarMenu()
{
    int opcion;
    do
    {

        cout<<'\n'<<
        "Elija una opcion:"<<'\n'<<
        "1- Añadir mascota."<<'\n'<<
        "2- Ver todas las mascotas de una determinada raza."<<'\n'<<
        "3- Consultar direccion de una mascota determinada"<<'\n'<<
        "4- Terminar programa"<<'\n'<<endl;
        cin>>opcion;
        cin.ignore();
        if (opcion < 1 or opcion > 4)
        {
            cout<<"Opcion no valida."<<'\n'<<endl;
        }
    }while(opcion < 1 or opcion > 4);
    return opcion;
}
bool buscarRaza(vector <perros_t> perros, string raza)
{
    int i = 0;
    bool hay = false;
    while(i < perros.size() and hay == false)
    {
        if(perros[i].raza == raza)
        {
            hay = true;
        }
        i++;
    }
    return hay;
}
void razaImp(vector <perros_t> perros, string raza)
{
    int i;
    for(i = 0; i < perros.size(); i++)
    {
        if(perros[i].raza == raza)
        {
            cout<<perros[i].nombre<<"    "<<perros[i].direccion<<endl;
        }
    }
}
void elegirRaza(vector <perros_t> perros)
{
    string raza;
    bool hay;
    do
    {
        cout<<"Que raza quiere buscar: ";
        getline(cin, raza);
        hay = buscarRaza(perros, raza);
    }while(hay == false);
    razaImp(perros, raza);
}
bool buscarNombre(vector <perros_t> perros, string nombre)
{
    int i = 0;
    bool hay = false;
    while(i < perros.size() and hay == false)
    {
        if(perros[i].nombre == nombre)
        {
            hay = true;
        }
        i++;
    }
    return hay;
}
void nombreImp(vector <perros_t> perros, string nombre)
{
    int i;
    for(i = 0; i < perros.size(); i++)
    {
        if(perros[i].nombre == nombre)
        {
            cout<<perros[i].nombre<<"    "<<perros[i].edad<<"    "<<perros[i].direccion<<"    "<<perros[i].barrio<<"    "<<perros[i].raza<<endl;
        }
    }
}
void elegirMascota(vector <perros_t> perros)
{
    string nombre;
    bool hay;
    do
    {
        cout<<"Que nombre quiere buscar: ";
        getline(cin, nombre);  
        hay = buscarNombre(perros, nombre);
    }while(hay == false);
    nombreImp(perros, nombre);

}

int main(void)
{
    vector <perros_t> perros;
    int opcion = 0;
    while(opcion != 4)
    {
        opcion = mostrarMenu();
        switch (opcion)
        {
            case 1:
            añadirMascota(perros);
            break;
            
            case 2:
            elegirRaza(perros);
            break;

            case 3:
            elegirMascota(perros);
            break;

            default:
            break;
        }
    
    }
    

}