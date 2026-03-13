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

int convertirHora(string dia, int &hora)
{
    int diaN;

    if(dia == "viernes"){diaN = 0;}
    if(dia == "sabado"){diaN = 1;}
    if(dia == "domingo"){diaN = 2;}
    if(hora == 14){hora = 0;}
    if(hora == 16){hora = 1;}
    if(hora == 20){hora = 2;}
    if(hora == 22){hora = 3;}
    return diaN;
}

void buscarCelda(pelicula_t funciones[3][4], string dia, int hora)
{
    int diaN;
    string nombre;
    diaN = convertirHora(dia, hora);
    nombre = funciones[diaN][hora].nombre;
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

int taquillera(pelicula_t funciones [3][4])
{
    int i, j;
    int cantidad = 0;

    for(i = 0; i < 3; i++)
    { 
        for(j = 0; j < 4; j++)
        { 
            if(funciones[3][4].vendidas > 50)
            {
                cantidad++;
            }
        }
    }
    return cantidad;
}

void promedioNoche(pelicula_t funciones[3][4])
{
    int i, j;
    float promedio = 0;

    for(i = 0; i < 3; i++)
    { 
        for(j = 2; j < 4; j++)
        { 
            promedio += funciones[i][j].precio;
        }
    }
    promedio = promedio / (3*2);

    cout << promedio << endl;
}

int main(void)
{
    pelicula_t funciones[3][4];
    llenarMatriz(funciones);
    elegirFecha(funciones);
    masCara(funciones);
    taquillera(funciones);
    promedioNoche(funciones);

    return 0;
}