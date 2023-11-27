def get_rounded_total(hour, minute):
    if minute >= 30:
        return hour + 1
    else:
        return hour


def get_parking_time(hour_entered, hour_left, minute_entered, minute_left):
    global parking_hour
    global parking_minute
    if minute_left < minute_entered:
        hour_left -= 1
        minute_left += 60
        parking_hour = hour_left - hour_entered
        parking_minute = minute_left - minute_entered
    else:
        parking_hour = hour_left - hour_entered
        parking_minute = minute_left - minute_entered


def get_rounded_total():
    global parking_minute, parking_hour
    if parking_minute >= 30:
        return parking_hour + 1
    else:
        return parking_hour


def get_vehicle(vtype):
    global vehicle_type
    if vtype.upper() == "C":
        vehicle_type = "Car"
    elif vtype.upper() == "B":
        vehicle_type = "Bus"
    elif vtype.upper() == "T":
        vehicle_type = "Truck"


def get_total_charge(round_total):
    global vehicle_type
    match (vehicle_type):
        case "Car":
            if round_total <= 3:
                return 0.0
            else:
                return round_total - 3 * 1.5
        case "Truck":
            if round_total <= 2:
                return 1.0
            else:
                return ((round_total - 2) * 2.3) + 1
        case "Bus":
            if round_total <= 1:
                return 2.0
            else:
                return ((total - 1) * 3.7) + 2
        case _:
            print("Invalid vehicle type!")


vehicle_type = input(f"Type of vehicle?\t\t")
hour_entered = int(input(f"Hour vehicle entered lot (0 - 24)?\t"))
minute_entered = int(input(f"Minute vehicle entered lot (0 - 60)?\t"))
hour_left = int(input(f"Hour vehicle left lot (0 - 24)?\t\t"))
minute_left = int(input(f"Minute vehicle left lot (0 - 60)?\t"))


get_parking_time(hour_entered, hour_left, minute_entered, minute_left)
rounded_total = get_rounded_total()
get_vehicle(vehicle_type)
total_charge = get_total_charge(rounded_total)

print(f"\n\tPARKING LOT CHARGE\t\n\n",
      f"Type of vehicle: {vehicle_type}\n",
      f"TIME-IN\t\t{hour_entered:02d}:{minute_entered:02}\n",
      f"TIME-OUT\t\t{hour_left:02d}:{minute_left:02}\n",
      f"\t\t\t--------\n",
      f"PARKING TIME\t\t{parking_hour:02d}:{parking_minute:02}\n",
      f"ROUNDED TOTAL\t\t{rounded_total:5d}\n",
      f"\t\t\t--------\n",
      f"TOTAL CHARGE\t\t${total_charge:4.2f}\n")
