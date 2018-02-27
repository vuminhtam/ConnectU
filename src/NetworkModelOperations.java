import java.time.LocalDate;
import java.util.List;

public interface NetworkModelOperations {
  /**
   * Reminds the user the friends to keep in touch with their friends. Update the list of friends
   * need to meet.
   *
   * @return the friends they haven't talk with out of their time range
   */
  String whoToMeet(LocalDate today);

  /**
   * Get the friend that is longest not seen.
   */
  String neededMost(LocalDate today);

  /**
   * Add a person to the user's social network.
   *
   * @param firstName first name
   * @param lastName  last name
   * @param firstMet  date of first met
   * @param phone     phone number
   * @param des       description of the friend
   * @throws IllegalArgumentException if the phone number is invalid
   */
  void addFriend(String firstName, String lastName, LocalDate firstMet, String phone, String... des);

  /**
   * Update to the program that they have met a person identified by their name = FirstName + " "
   * LastName.
   *
   * @param name       name of the person
   * @param today      date of meeting
   * @param phoneInput optional phone number input if the user think he/she has friends with same
   *                   name
   */
  void updateMeet(String name, LocalDate today, char... phoneInput);

  /**
   * Set the maximum time range not talking to this person.
   *
   * @param timeRange  the input period
   * @param name       name of the person
   * @param phoneInput optional phone number input if the user think he/she has friends with same
   *                   name
   */
  void setTimeRange(String name, int timeRange, char... phoneInput);

  /**
   * Filter all people that match the search descriptions, seperated by blank space. A phrase should
   * be seperated by dash '-'.
   *
   * @param tags list of search criterias
   * @return search results
   */
  String lookUp(String... tags);

  /**
   * Get all description words that the person has used.
   *
   * @return all words to describe a person
   */
  List<String> getAllDescription();

  /**
   * Get a list of all friends in the network.
   *
   * @return the information of all friends
   */
  String getAllFriends();


  /**
   * Get the information of all friends in the network
   *
   * @return the information of this network
   */
  @Override
  String toString();
}
