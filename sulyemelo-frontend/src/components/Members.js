import React, {useState, useEffect} from 'react';
import axios from 'axios';


const Members = () => {

    const [members, setMembers] = useState([]);

    useEffect(() => {
        fetchMembers();
    }, []);

    const fetchMembers = () => {
        axios.get('http://localhost:8081/member/getAll').then(res => {
            setMembers(res.data);
        });
    };

    const formattedMembers = members.map((member, index) => {
        return (
            <div>
                <h3>{member.name}</h3>
                <p>Súlcsoport: {member.weightClass}</p>
            </div>
        );
    });

    return (
        <div>
            {formattedMembers}
        </div>
    );
};


export default Members
