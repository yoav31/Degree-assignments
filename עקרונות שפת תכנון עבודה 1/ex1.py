def finishTime(start_hours,start_minutes,start_seconds,flight_seconds):
    second=""
    minute=""
    hour="hours"
    start_seconds+=flight_seconds  #seconds
      
     
    days=0
    if start_seconds>=60:
        minutes=start_seconds//60
        start_minutes+=minutes
        start_seconds=start_seconds-minutes*60  #seconds
    if start_minutes>=60:
        hours=start_minutes//60
        start_hours+=hours
        start_minutes=start_minutes-hours*60  #minutes
    if start_hours>=24:
        days=start_hours//24            #days
        start_hours=start_hours-days*24    #hours
    
    if start_seconds==1:
        second="second" 
    elif start_seconds>1:
        second="seconds"  
    if start_minutes==1:
        minute="minute"
    elif start_minutes>1:
        minute="minutes"
    if start_hours==1:
        hour="hour" 

    if days==0:
        if start_seconds==0 and start_minutes==0:
            print(f"{start_hours} {hour} exactly")
        elif start_seconds==0:
            print(f"{start_hours} {hour}, {start_minutes} {minute}")
        elif start_minutes==0:
            print(f"{start_hours} {hour}, {start_seconds} {second}")  
        else:     
            print(f"{start_hours} {hour}, {start_minutes} {minute}, {start_seconds} {second}")   

    elif days==1:
        if start_seconds==0 and start_minutes==0:
            print(f"{start_hours} {hour} exactly  (+{days} day)")
        elif start_seconds==0:
            print(f"{start_hours} {hour}, {start_minutes} {minute}  (+{days} day)")
        elif start_minutes==0:
            print(f"{start_hours} {hour}, {start_seconds} {second}  (+{days} day)")  
        else:     
            print(f"{start_hours} {hour}, {start_minutes} {minute}, {start_seconds} {second}  (+{days} day)") 

    else:
        if start_seconds==0 and start_minutes==0:
            print(f"{start_hours} {hour} exactly  (+{days} days)")
        elif start_seconds==0:
            print(f"{start_hours} {hour}, {start_minutes} {minute}  (+{days} days)")
        elif start_minutes==0:
            print(f"{start_hours} {hour}, {start_seconds} {second}  (+{days} days)")  
        else:     
            print(f"{start_hours} {hour}, {start_minutes} {minute}, {start_seconds} {second}  (+{days} days)") 


               

print("enter your start time")
start_hours=(int(input("hours:")))
start_minutes=(int(input("minutes:")))
start_seconds=(int(input("seconds:")))
print("enter your flight time")
flight_seconds=(int(input("seconds:")))
finishTime(start_hours,start_minutes,start_seconds,flight_seconds)