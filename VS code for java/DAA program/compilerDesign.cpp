#include <iostream>
#include <vector>
#include <sstream>

using namespace std;

// Function to split a string into a vector of substrings
vector<string> split(const string &s, char delimiter) {
    vector<string> tokens;
    string token;
    istringstream tokenStream(s);
    while (getline(tokenStream, token, delimiter)) {
        tokens.push_back(token);
    }
    return tokens;
}

// Function to check if a non-terminal has left recursion
bool hasLeftRecursion(const string &nonTerminal, const vector<string> &productions) {
    for (const string &production : productions) {
        if (production.find(nonTerminal + " ") == 0) {
            return true;
        }
    }
    return false;
}

// Function to remove left recursion from a grammar
void removeLeftRecursion(const string &nonTerminal, vector<string> &productions) {
    vector<string> newProductions;
    vector<string> alphaProductions;
    vector<string> betaProductions;

    // Divide productions into alpha and beta groups
    for (const string &production : productions) {
        if (production.find(nonTerminal + " ") == 0) {
            alphaProductions.push_back(production.substr(nonTerminal.length() + 1));
        } else {
            betaProductions.push_back(production);
        }
    }

    // Create new productions without left recursion
    for (const string &betaProduction : betaProductions) {
        newProductions.push_back(betaProduction + " " + nonTerminal + "'");
    }

    for (const string &alphaProduction : alphaProductions) {
        newProductions.push_back(alphaProduction + " " + nonTerminal + "'");
    }

    newProductions.push_back("epsilon");  // Adding epsilon production

    // Print the modified productions
    cout << nonTerminal << " -> ";
    for (size_t i = 0; i < newProductions.size(); ++i) {
        if (i > 0) {
            cout << " | ";
        }
        cout << newProductions[i];
    }
    cout << endl;
}

int main() {
    // Input grammar
    vector<string> productions = {
        "E -> E + T",
        "E -> T",
        "T -> T * F",
        "T -> F",
        "F -> ( E )",
        "F -> id"
    };

    // Process each non-terminal to remove left recursion
    for (const string &production : productions) {
        vector<string> parts = split(production, ' ');
        if (hasLeftRecursion(parts[0], productions)) {
            removeLeftRecursion(parts[0], productions);
        } else {
            cout << production << endl;
        }
    }

    return 0;
}
