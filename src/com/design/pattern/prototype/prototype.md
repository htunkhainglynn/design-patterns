### Prototype Design Pattern

Prototype design pattern ဟာ costly ဖြစ်တဲ့ resource တွေကို ဆွဲယူတဲ့အခါ ထပ်ခါထပ်ခါမလုပ်စေပဲ တစ်ခါဆွဲပြီး property တွေကို set ပြီးတာနဲ့ ထပ်မဆွဲတော့ပဲ clone လုပ်ပြီး performance optimizing လုပ်လို့ရတဲ့ design pattern တစ်ခုဖြစ်ပါတယ်။

Java မှာဆိုရင်တော့ Cloneable interface ရှိပြီး implements လုပ်ထားတဲ့ class မှာ Object.clone() ကိုခေါ်လိုက်ရင် property တွေကို copy ကူးထားတဲ့ ထပ်တူညီတဲ့ object တစ်ခုကိုပြန်ထုတ်ပေးမှာဖြစ်ပါတယ်။

```agsl
package com.design.pattern.prototype;

public class HeavyObject implements Prototype {

    String computeIntensiveProperty;

    static String getComputeIntensiveProperty() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted");
        }
        return "Compute Intensive Property";
    }

    public HeavyObject() {
        this.computeIntensiveProperty = getComputeIntensiveProperty();
    }

    @Override
    public HeavyObject reproduce() {
        try{
            // implementing Cloneable interface and overriding clone() method can copy the object properties
            Prototype prototype = (Prototype) super.clone();
            return (HeavyObject) prototype;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported");
        }
    }
}
```
```agsl
package com.design.pattern.prototype;

public interface Prototype extends Cloneable {
    Prototype reproduce();
}

```
ဒီမှာတော့ Cloneable interface ကို Prototype ဆိုတဲ့ interface တစ်ခုနဲ့ ခံသုံးတာကြောင့်  ```Object.clone()``` ကို ```super.clone()``` နဲ့ implement လုပ်ပြီး ရလာတဲ့ Prototype object ကို type cast လုပ်ပြီး လိုချင်တဲ့ Object ကို clone လုပ်တာအဆင်ပြေသွားပါတယ်။

```agsl
package com.design.pattern.prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        HeavyObject heavyObject = new HeavyObject();
        System.out.println(heavyObject.computeIntensiveProperty);

        // doesn't need to wait for 2 seconds
        HeavyObject heavyObject1 = heavyObject.reproduce();
        System.out.println(heavyObject1.computeIntensiveProperty);
    }
}
```

ဒီ code ကို run ကြည့်ရင်တော့ ဒုတိယ output ထုတ်ရင် 2 seconds မစောင့်ရပဲ ချက်ချင်းထွက်လာမှာဖြစ်ပါတယ်။
