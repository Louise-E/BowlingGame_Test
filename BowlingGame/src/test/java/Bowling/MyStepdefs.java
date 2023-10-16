package Bowling;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Game game = new Game();

    private int rolls;

    //bowling game
    @Given("I roll bowling ball {int} times")
    public void iRollBowlingBallRollsTimes(int number) {
        rolls = number;
    }

    @And("I knock down {int} every roll")
    public void iKnockDownPinsEveryRoll(int number){
        for (int i = 0; i < rolls; i++) {
            game.roll(number);
        }
    }

    @When("I play a bowling game")
    public void iPlayABowlingGame() {
        game.score();
    }

    @Then("I should get a total {int}")
    public void iShouldGetATotalScore(int number) {
        assert (game.score() == number);

    }

    @Given("I roll a strike")
    public void iRollAStrike() {
        game.roll(10);
    }

    @And("I hit {int} and {int} pins in next two rolls")
    public void iHitAndPinsInNextTwoRolls(int number1, int number2) {
    game.roll(number1);
    game.roll(number2);
    }

    @And("I {int} on the rest of the rolls")
    public void iOnTheRestOfTheRolls(int number) {
        for (int i = 0; i < game.remainingRolls(); i++) {
            game.roll(number);
        }
    }

    @Then("my total score should be {int}")
    public void myTotalScoreShouldBe(int number) {
        assert (game.score() == number);
    }

    @Given("I roll a spare")
    public void iRollASpare() {
        game.roll(5);
        game.roll(5);
    }

    //bowling roll
    @Given("I hit the {int} pins")
    public void iHitThePinsPins(int number) {
        game.roll(number);
    }

    @When("I roll the bowling ball")
    public void iRollTheBowlingBall() {
        game.score();
    }

    @Then("I should get {int}")
    public void iShouldGetScore(int number) {
        assert (game.score() == number);
    }
}
