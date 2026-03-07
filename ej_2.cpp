#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct producto_t{
    string nombre;
    string codigo;
    string marca;
    float precio;
    bool vence;
};
struct gondola_t{
    int numero;
    string categoria;
    producto_t gondolas[3][4];
};

void crearGondola(vector <gondola_t> &pasillo, int &numeroDeGondola)
{
    int i;
    int j;
    producto_t producto;
    gondola_t gondola;
    
    gondola.numero = numeroDeGondola;
    cout<<"categoria de la gondola:"<<endl;
    getline(cin, gondola.categoria);

    cout<<"ingrese productos en la gondola "<< numeroDeGondola <<endl;
    for(i = 0; i < 3; i++)
    {
        cout<<"fila "<< i + 1 << ":" <<endl;
        cout<<"------------------------"<<endl;
        for(j = 0; j < 4; j++)
        { 
            cout<<"producto de la columna "<< j + 1<< ": "<<endl;
            cout<<"nombre: ";
            getline(cin, producto.nombre);
            cout<<"codigo de barras: ";
            getline(cin, producto.codigo);
            cout<<"marca: ";
            getline(cin, producto.marca);
            cout<<"precio: ";
            cin>>producto.precio;
            cout<<"Vence? (1 o 0): ";
            cin>>producto.vence;
            cin.ignore();
            cout<<"------------------------"<<endl;
            gondola.gondolas[i][j] = producto;
        }
    }
    numeroDeGondola++;
    pasillo.push_back(gondola);
}
void loQuePidioElProfe(vector <gondola_t> pasillo, int numeroDeGondola)
{
    int i;
    int j;
    int cantidad = 0;
    int numero;
    int columna;
    string nombre;
    float suma = 0;
    float precio = 0;
    float promedio = 0;
    do
    {
        cout<<"Numero de gondola a analizar: ";
        cin>>numero;
        cout<<"-----------------------------------"<<endl;
        if(numero > numeroDeGondola or numero <= 0)
        {
            cout<<"No existe esa gondola, escribi otra vez"<<endl;
        }
    }while(numero > numeroDeGondola or numero <= 0);
    numero--;
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 4; j++)
        {
            suma += pasillo[numero].gondolas[i][j].precio;
            if(pasillo[numero].gondolas[i][j].vence == true)
            {
                cantidad++;
            }
            if(pasillo[numero].gondolas[i][j].precio > precio)
            {
                precio = pasillo[numero].gondolas[i][j].precio;
                columna = j + 1;
            }
        }
    }
    promedio = suma / 12;
    nombre = pasillo[numero].gondolas[1][2].nombre;

    cout<<"columna con precio de mas valor: "<<columna<<endl;
    cout<<"nombre del producto de la gondola en [2] [3]: "<<nombre<<endl;
    cout<<"promedio de precios: "<<promedio<<endl;
    cout<<"cantidad de productos con fecha de vencimiento: "<<cantidad<<endl;
    
}
int main()
{
    vector <gondola_t> pasillo;
    int numeroDeGondola = 1;
    int respuesta = 0;

    while(respuesta != 3)
    {
        cout<<"Que queres hacer?"<<'\n'<<
        "   1- Crear gondolas"<<'\n'<<
        "   2- Lo que pidio el profe"<<'\n'<<
        "   3- Terminar"<<endl;

        cin>>respuesta;
        cin.ignore();
        if(respuesta == 1)
        {
            crearGondola(pasillo, numeroDeGondola);
        }
        else if(respuesta == 2)
        {
            loQuePidioElProfe(pasillo, numeroDeGondola);
        }
        else
        {
            if(respuesta != 3)
            {
                cout<<"bobo"<<endl;
            }
        }
    }
    return 0;
}