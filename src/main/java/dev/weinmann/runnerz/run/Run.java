package dev.weinmann.runnerz.run;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Run {
  
  private Integer id;
  private String title;
  private LocalDateTime startedOn;
  private LocalDateTime completedOn;
  private Integer kilometers;
  private Location location;

  public Run(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer kilometers, Location location) {
    this.id = id;
    this.title = title;
    this.startedOn = startedOn;
    this.completedOn = completedOn;
    this.kilometers = kilometers;
    this.location = location;
    if (!completedOn.isAfter(startedOn)) {
      throw new IllegalArgumentException("Completed On must be after Started On");
    }
  }

  public Duration getDuration() {
    return Duration.between(startedOn, completedOn);
  }

  public Integer getAvgPace() {
    return Math.toIntExact(getDuration().toMinutes() / kilometers);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(LocalDateTime startedOn) {
    this.startedOn = startedOn;
  }

  public LocalDateTime getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(LocalDateTime completedOn) {
    this.completedOn = completedOn;
  }

  public Integer getKilometers() {
    return kilometers;
  }

  public void setKilometers(Integer kilometers) {
    this.kilometers = kilometers;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || !(getClass() == o.getClass())) return false;
    Run run = (Run) o;
    return Objects.equals(id, run.id) && Objects.equals(title, run.title) && Objects.equals(startedOn, run.startedOn) && Objects.equals(completedOn, run.completedOn) && Objects.equals(kilometers, run.kilometers) && Objects.equals(location, run.location);
  }

  @Override
  public int hashCode() {
    return Object.hash(id, title, startedOn, completedOn, kilometers, location);
  }
}
