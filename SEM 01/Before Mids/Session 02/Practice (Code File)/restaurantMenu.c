#include <stdio.h>

int main() {
    int choice, confirm;
    float price = 0;

    printf("Name: Okasha Nadeem\n");
    printf("ID: BSE_25F-086\n");
    printf("Section: Fall 2025 1-B\n\n");

    printf("===== The Food Lounge =====\n\n");
    printf("Menu (Prices in PKR):\n");
    printf("1. Burger   - 1540 PKR\n");
    printf("2. Pizza    - 2240 PKR\n");
    printf("3. Pasta    - 1750 PKR\n");
    printf("4. Sandwich - 1330 PKR\n");
    printf("5. Fries    - 840 PKR\n\n");

    printf("Select a dish (1-5): ");
    scanf("%d", &choice);

    switch(choice) {
        case 1: price = 1540; break;
        case 2: price = 2240; break;
        case 3: price = 1750; break;
        case 4: price = 1330; break;
        case 5: price = 840;  break;
        default:
            printf("Invalid choice!\n");
            return 0;
    }

    printf("\nPress 1 to confirm order: ");
    scanf("%d", &confirm);

    if (confirm == 1) {
        float tax = price * 0.05;
        printf("\n===== Order Summary =====\n");
        printf("Dish Price: %.2f PKR\n", price);
        printf("Tax (5%%):   %.2f PKR\n", tax);
        printf("Total:      %.2f PKR\n", price + tax);
        printf("=========================\n");
        printf("Thank you!\n");
    } else {
        printf("Order canceled.\n");
    }

    return 0;
}

