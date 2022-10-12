public class Consumer {

    INumberProvider provider;

    Consumer(INumberProvider provider) {
        this.provider = provider;
    }

    public void advertisementSentTo() {
        System.out.println(provider.getPhoneNos());
    }
}