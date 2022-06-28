public class LogoutUI {
    private LoginAccountController loginAccountController;

    public LogoutUI(LoginAccountController loginAccountController){
        this.loginAccountController = loginAccountController;
    }

    public void handleLogout() throws InterruptedException{
        System.out.println("Logout ... ");
        Thread.sleep(1000);
        loginAccountController.logout();
        System.out.println("[LOGGED_OUT] You have been logged out");
    }
}
