#include <iostream>

int main() {
    double n1 = 0.0;
    double n2 = 0.0;

    std::cout << "Primeira nota: ";
    std::cin >> n1;

    std::cout << "Segunda nota: ";
    std::cin >> n2;

    double media = (n1 + n2) / 2.0;

    if (media >= 7.0) {
        std::cout << "Média: " << media << " — Aprovado\n";
    } else {
        std::cout << "Média: " << media << " — Em recuperação\n";
    }

    return 0;
}
