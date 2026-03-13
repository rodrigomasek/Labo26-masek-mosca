/*
2. Se quiere desarrollar un programa para gestionar las funciones de un cine 
durante un fin de semana.
De cada película interesa guardar la siguiente información:
• Nombre de la película
• Número de sala
• Precio de la entrada
• Lista de entradas vendidas totales (no discrimina por horario)
El cine organiza sus funciones en una matriz de 3 días por 4 horarios. 
*/
#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct pelicula_t{
    string nombre;
    int numero;
    float precio;
    int vendidas;
};
void llenarMatriz(pelicula_t funciones[3][4])
{
    int i;
    int j;
    for(i = 0; i < 3; i++)
    { 
        for(j = 0; j < 4; j++)
        { 
            funciones[i][j].nombre = "Barbie 2";
            funciones[i][j].numero = 1;
            funciones[i][j].precio = 1000;
            funciones[i][j].vendidas = 5;
        }
    }
}
void imprimirNombre(string nombre)
{
    cout<<nombre<<endl;
}
void masCara(pelicula_t funciones[3][4])
{
    int i;
    int j;
    int columna;
    int fila;
    float precio;
    string nombre;
    for(i = 0; i < 3; i++)
    { 
        for(j = 0; j < 4; j++)
        { 
            if(funciones[i][j].precio > precio)
            {
                precio = funciones[i][j].precio;
                columna = j;
                fila = i;
            }
        }
    }
    nombre = funciones[fila][columna].nombre;
    imprimirNombre(nombre);
}
void buscarCelda(pelicula_t funciones[3][4], string dia, int hora)
{
    int diaN;
    int horaN;
    string nombre;
    if(dia == "viernes"){diaN = 0;}
    if(dia == "sabado"){diaN = 1;}
    if(dia == "domingo"){diaN = 2;}
    if(hora == 14){horaN = 0;}
    if(hora == 16){horaN = 1;}
    if(hora == 20){horaN = 2;}
    if(hora == 22){horaN = 3;}
    nombre = funciones[diaN][horaN].nombre;
    imprimirNombre(nombre);
}

void elegirFecha(pelicula_t funciones[3][4])
{
    string dia;
    int hora;
    cout<<"elegi que dia: ";
    getline(cin, dia);
    cout<<"elegi la hora: ";
    cin>>hora;
    cin.ignore();
    buscarCelda(funciones, dia, hora);
}
int main(void)
{
    pelicula_t funciones[3][4];
    llenarMatriz(funciones);
    elegirFecha(funciones);
    masCara(funciones);
    


}