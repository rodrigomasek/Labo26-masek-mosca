#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct Empleado_t
{
    string nombre;
    string apellido;
    string fechaN;
    char sexo;
    float salario;
};

void cargar(vector <Empleado_t> &empleados)
{
    Empleado_t empleado;

    cin >> empleado.nombre;

    while(empleado.nombre != "fin")
    {
        cin >> empleado.apellido;
        cin >> empleado.fechaN;
        cin >> empleado.sexo;
        cin >> empleado.salario;   

        empleados.push_back(empleado);
        cin >> empleado.nombre;   
    }
}

float empleadoConMayorSueldo(vector <Empleado_t> &empleados, vector <Empleado_t> &pobres)
{
    int i = 0;
    float comparador = empleados[i].salario;

    for(i = 0; i < empleados.size(); i++)
    {
        if(empleados[i].salario <= 400000)
        {
            pobres.push_back(empleados[i]);
            empleados.erase(empleados.begin() + i);
            i--;
        }
        if(empleados[i].salario > comparador)
        {
            comparador = empleados[i].salario;
        }
    }
    return comparador;
}

int main()
{
    vector <Empleado_t> empleados;
    vector <Empleado_t> pobres;
    Empleado_t empleado;
    int i;

    cout << "escribi" << endl;

    cargar(empleados);

    cout << "mayor sueldo: " << empleadoConMayorSueldo(empleados, pobres) << endl;

    for(i = 0; i < (int)pobres.size(); i++)
    {
        cout << pobres[i].nombre << " " << pobres[i].apellido << endl;
    }

    return 0;
}