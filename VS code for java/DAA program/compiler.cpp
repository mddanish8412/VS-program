#include <iostream> 
#include <cstring> 
using namespace std; 
int main() { 
    char icode[10][30], str[20], opr[10]; 
    int i = 0; 
    cout << "\nEnter the set of intermediate code (terminated by exit):\n"; 
    do {
cin >> icode[i]; 
i++;
} while (strcmp(icode[i - 1], "exit") != 0); 
cout << "\nTarget code generation:\n"; 
cout << "\nIntermediate Code\n"; 
i = 0; do {
strcpy(str, icode[i]); 
switch (str[3]) { 
    case '+': strcpy(opr, "ADD");
break; 
case '-': strcpy(opr, "SUB"); 
break; 
case '*': strcpy(opr, "MUL"); 
break; 
case '/': strcpy(opr, "DIV"); 
break;
}
cout << "\nMov " << str[2] << ", R" << i; 
cout << "\n" << opr << " " << str[4] << ", R" << i; 
cout << "\nMov R" << i << ", " << str[0]; 
i++;
} while (strcmp(icode[i - 1], "exit") != 0); 
return 0;
}
