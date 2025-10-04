//questão 11

long fatorial(int n) {
    if (n == 0) {
        return 1; // caso base
    } else {
        return n * fatorial(n - 1); // chamada recursiva
    }
}

//questão 12

String decimalParaBinario(int n) {
    if (n == 0) {
        return "0";
    } else if (n == 1) {
        return "1";
    } else {
        return decimalParaBinario(n / 2) + (n % 2);
    }
}

//questão 13

int potencia(int x, int n) {
    if (n == 0) {
        return 1;
    } else {
        return x * potencia(x, n - 1);
    }
}


//questão 14

boolean ehPrimo(int n, int divisor) {
    if (n < 2) {
        return false;
    }
    if (divisor * divisor > n) {
        return true; // não há divisores
    }
    if (n % divisor == 0) {
        return false; // encontrou divisor
    }
    return ehPrimo(n, divisor + 1); // testa o próximo
}


