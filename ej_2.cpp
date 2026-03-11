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
void mayorValor(vector <gondola_t> pasillo, int numero)
{
    float precio = 0;
    int columna = 0;
    int i = 0;
    int j = 0;
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 4; j++)
        {
            if(pasillo[numero].gondolas[i][j].precio > precio)
            {
                precio = pasillo[numero].gondolas[i][j].precio;
                columna = j + 1;
            }
        }
    }
    cout<<"columna con precio de mas valor: "<<columna<<endl;
}
void promedioPrecios(vector <gondola_t> pasillo, int numero)
{
    int i = 0;
    int j = 0;
    float suma = 0;
    float promedio = 0;
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 4; j++)
        {
            suma += pasillo[numero].gondolas[i][j].precio;
        }
    }
    promedio = suma / (i*j);
    cout<<"promedio de precios: "<<promedio<<endl;
}
void cantidadProductos(vector <gondola_t> pasillo, int numero)
{
    int j = 0;
    int i = 0;
    int cantidad = 0;
    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 4; j++)
        {
            if(pasillo[numero].gondolas[i][j].vence == true)
            {
                cantidad++;
            }
        }
    }
    cout<<"cantidad de productos con fecha de vencimiento: "<<cantidad<<endl;
}
void elegirGondola(vector <gondola_t> pasillo, int numeroDeGondola)
{
    int numero;
    string nombre;
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
    mayorValor(pasillo, numero);
    promedioPrecios(pasillo, numero);
    cantidadProductos(pasillo, numero);
    nombre = pasillo[numero].gondolas[1][2].nombre;
}
int main(void)
{
    vector <gondola_t> pasillo;
    int numeroDeGondola = 1;
    int respuesta = 0;

    while(respuesta != 3)
    {
        cout<<"Que queres hacer?"<<'\n'<<
        "   1- Crear gondolas"<<'\n'<<
        "   2- Elegir gondola"<<'\n'<<
        "   3- Terminar"<<endl;

        cin>>respuesta;
        cin.ignore();
        if(respuesta == 1)
        {
            crearGondola(pasillo, numeroDeGondola);
        }
        else if(respuesta == 2)
        {
            elegirGondola(pasillo, numeroDeGondola);
        }
        else if (respuesta != 3)
        {
            cout<<"bobo"<<endl;
        }
    }
    return 0;
}