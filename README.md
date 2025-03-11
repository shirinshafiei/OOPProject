#
## بخش اول: روش‌های پرداخت

این بخش شامل اینترفیس `PaymentStrategy` و کلاس‌هایی است که این اینترفیس را پیاده‌سازی می‌کنند:

- **اینترفیس PaymentStrategy**: دو متد دارد:
  - `void pay(double amount)`: متد پرداخت.
  - `String getPaymentDetails()`: این متد، باید اطلاعات مربوط به هر روش پرداخت را به شکل یک رشته برگرداند.

- **کلاس‌های پیاده‌سازی کننده PaymentStrategy**:
  - `CreditCardPayment`: پرداخت با کارت اعتباری.
  - `PayPalPayment`: پرداخت با پی‌پال.
  - `BitcoinPayment`: پرداخت با بیتکوین.

## بخش دوم: مشتریان

این بخش شامل کلاس abstract `Customer` و زیرکلاس‌های آن است:

- **کلاس abstract Customer**: این کلاس نشان‌دهنده مشتریان است و دارای متدهای زیر است:
  - `Customer(String name)`: کانستراکتور برای مقداردهی نام مشتری.
  - `void displayCustomerInfo()`: چاپ اطلاعات مشتری.
  - `void makePayment(PaymentStrategy paymentStrategy, double amount)`: متد پرداخت توسط مشتری.
  - `void showPaymentHistory()`: چاپ تاریخچه پرداخت مشتری.

- **زیرکلاس‌های Customer**:
  - `RegularCustomer`: مشتری معمولی.
  - `PremiumCustomer`: مشتری پرمیوم.
